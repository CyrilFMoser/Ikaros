package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int, b: (T_A[Boolean],T_A[Int]), c: Boolean) extends T_A[T_B[T_B[Char]]]
case class CC_B(a: CC_A, b: T_B[T_B[CC_A]], c: T_A[T_A[CC_A]]) extends T_A[T_B[T_B[Char]]]
case class CC_C(a: CC_A, b: CC_B) extends T_A[T_B[T_B[Char]]]
case class CC_D[C]() extends T_B[C]

val v_a: T_A[T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, (_,_), true), _, _) => 0 
  case CC_B(CC_A(_, (_,_), false), _, _) => 1 
  case CC_C(CC_A(_, _, _), _) => 2 
}
}
// This is not matched: CC_A(_, _, _)