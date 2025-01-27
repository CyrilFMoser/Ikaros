package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_A]) extends T_A
case class CC_C(a: CC_A, b: T_B[(CC_B,(Boolean,Char))]) extends T_A
case class CC_D() extends T_B[Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_C(_, _)) => 1 
  case CC_B(_) => 2 
  case CC_C(_, _) => 3 
}
}
// This is not matched: CC_A(CC_B(_))