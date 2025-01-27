package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[(T_A[Int, Byte],T_A[Char, Boolean]), ((Boolean,Int),T_A[Boolean, Char])]
case class CC_B(a: (CC_A[Boolean],T_A[Boolean, Boolean])) extends T_A[(T_A[Int, Byte],T_A[Char, Boolean]), ((Boolean,Int),T_A[Boolean, Char])]
case class CC_C(a: Byte, b: T_A[T_A[CC_B, CC_B], CC_B]) extends T_A[(T_A[Int, Byte],T_A[Char, Boolean]), ((Boolean,Int),T_A[Boolean, Char])]

val v_a: T_A[(T_A[Int, Byte],T_A[Char, Boolean]), ((Boolean,Int),T_A[Boolean, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}