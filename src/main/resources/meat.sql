#sql("paginate")
	select *
	from meat
	#set(flag=0)
	#if(qo.keyword)
		#(flag==0?"where":"and") id like concat('%',#para(qo.keyword),'%')
		#set(flag=1)
	#end
#end
#sql("selectAllByState")
	select *
	from meat
	where state=#para(state)
#end
