package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[Byte], c: T_A[T_A[Char]]) extends T_A[(Int,(Char,Byte))]
case class CC_B(a: CC_A, b: CC_A) extends T_A[(Int,(Char,Byte))]
case class CC_C(a: CC_B, b: Boolean, c: CC_B) extends T_A[(Int,(Char,Byte))]

val v_a: T_A[(Int,(Char,Byte))] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_C(CC_B(_, _), true, CC_B(_, _)) => 2 
  case CC_C(CC_B(_, _), false, CC_B(_, _)) => 3 
}
}