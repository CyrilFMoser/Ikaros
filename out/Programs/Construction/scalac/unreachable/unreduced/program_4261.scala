package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Int]]) extends T_A[Int]
case class CC_B(a: T_B, b: Char) extends T_A[Int]
case class CC_C(a: (T_B,T_A[Int]), b: T_A[T_A[T_B]], c: CC_A) extends T_B
case class CC_D(a: T_B) extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}