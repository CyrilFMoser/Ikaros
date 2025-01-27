package Program_21 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: Int) extends T_A[(Boolean,T_A[Char])]
case class CC_B(a: Boolean, b: CC_A[T_A[Boolean]]) extends T_A[(Boolean,T_A[Char])]

val v_a: T_A[(Boolean,T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, 12)) => 1 
  case CC_B(_, CC_A(_, _)) => 2 
}
}