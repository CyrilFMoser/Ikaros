package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[T_B[Byte]]]
case class CC_B[E](a: T_B[CC_A[Boolean]], b: T_A[E, E], c: T_B[E]) extends T_B[E]
case class CC_C[G]() extends T_B[G]
case class CC_D(a: Char, b: CC_C[T_B[Char]], c: (T_B[Int],CC_B[Boolean])) extends T_B[T_A[Int, CC_C[Int]]]

val v_a: T_B[T_A[Int, CC_C[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, _) => 0 
  case CC_B(CC_B(CC_C(), _, CC_B(_, _, _)), _, _) => 1 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_C()), _, _) => 2 
  case CC_B(CC_B(CC_C(), _, CC_C()), _, _) => 3 
  case CC_B(CC_C(), _, _) => 4 
  case CC_C() => 5 
  case CC_D(_, CC_C(), (CC_B(_, _, _),CC_B(_, _, _))) => 6 
  case CC_D(_, CC_C(), (CC_C(),CC_B(_, _, _))) => 7 
}
}