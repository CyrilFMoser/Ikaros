package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[Byte, Boolean],T_A[(Int,Char), Byte]), b: Int) extends T_A[T_A[((Int,Boolean),Char), (Boolean,Int)], ((Char,Int),T_A[Byte, Byte])]
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A[T_A[((Int,Boolean),Char), (Boolean,Int)], ((Char,Int),T_A[Byte, Byte])]
case class CC_C(a: T_A[CC_B, CC_A], b: CC_A) extends T_A[T_A[((Int,Boolean),Char), (Boolean,Int)], ((Char,Int),T_A[Byte, Byte])]

val v_a: T_A[T_A[((Int,Boolean),Char), (Boolean,Int)], ((Char,Int),T_A[Byte, Byte])] = null
val v_b: Int = v_a match{
  case CC_A((_,_), 12) => 0 
  case CC_A((_,_), _) => 1 
  case CC_B(CC_A(_, _), CC_A(_, _), _) => 2 
  case CC_C(_, _) => 3 
}
}