package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_B[Char]]]
case class CC_B(a: T_B[CC_A], b: T_B[Int], c: T_B[T_A[CC_A]]) extends T_A[T_B[T_B[Char]]]
case class CC_C(a: T_A[T_A[CC_B]]) extends T_A[T_B[T_B[Char]]]
case class CC_D(a: T_B[CC_C], b: CC_C, c: CC_B) extends T_B[CC_C]
case class CC_E(a: CC_B) extends T_B[CC_C]

val v_a: T_A[T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}