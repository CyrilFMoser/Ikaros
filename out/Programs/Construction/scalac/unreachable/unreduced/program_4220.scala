package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_A[Char]) extends T_A[Char]
case class CC_B() extends T_A[Char]
case class CC_C(a: CC_A) extends T_A[Char]
case class CC_D(a: Boolean, b: T_A[CC_C]) extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, _), _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}