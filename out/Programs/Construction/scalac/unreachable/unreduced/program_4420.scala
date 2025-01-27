package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_A[CC_A], b: Boolean, c: Char) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_B) extends T_A[T_A[T_A[Char]]]
case class CC_D[D](a: Int, b: CC_B) extends T_B[CC_C, D]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_B(_, _, _)) => 2 
}
}