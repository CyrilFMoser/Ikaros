package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C, c: (T_A[(Int,Byte), Boolean],Char)) extends T_A[C, T_A[C, C]]
case class CC_B() extends T_A[T_A[CC_A[(Byte,Byte)], T_A[CC_A[(Byte,Byte)], CC_A[(Byte,Byte)]]], T_A[T_A[CC_A[(Byte,Byte)], T_A[CC_A[(Byte,Byte)], CC_A[(Byte,Byte)]]], T_A[CC_A[(Byte,Byte)], T_A[CC_A[(Byte,Byte)], CC_A[(Byte,Byte)]]]]]

val v_a: T_A[T_A[CC_A[(Byte,Byte)], T_A[CC_A[(Byte,Byte)], CC_A[(Byte,Byte)]]], T_A[T_A[CC_A[(Byte,Byte)], T_A[CC_A[(Byte,Byte)], CC_A[(Byte,Byte)]]], T_A[CC_A[(Byte,Byte)], T_A[CC_A[(Byte,Byte)], CC_A[(Byte,Byte)]]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, (_,_)), CC_A(_, CC_A(_, _, _), _), (_,_)) => 0 
  case CC_B() => 1 
}
}