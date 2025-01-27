package Program_21 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Boolean, b: Byte) extends T_A[Char]
case class CC_B(a: T_A[Int]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(true, _) => 0 
  case CC_A(false, _) => 1 
  case CC_B(_) => 2 
}
}