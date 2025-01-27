package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A], b: T_B[Boolean]) extends T_B[T_B[T_B[Char]]]
case class CC_C(a: T_A, b: Int, c: T_A) extends T_B[T_B[T_B[Char]]]
case class CC_D() extends T_B[T_B[T_B[Char]]]

val v_a: T_B[T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_C(_, _, CC_A())