package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: T_A, c: Char) extends T_A
case class CC_B() extends T_B[Int]
case class CC_C(a: T_B[T_B[Int]], b: T_A) extends T_B[Int]
case class CC_D() extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_D()