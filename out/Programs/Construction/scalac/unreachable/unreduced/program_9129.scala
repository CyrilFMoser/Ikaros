package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[D, D], c: T_A[T_B[D], D]) extends T_A[T_B[D], D]
case class CC_B() extends T_B[T_A[T_B[Char], T_A[Char, Int]]]
case class CC_C(a: T_A[T_B[(CC_B,CC_B)], (CC_B,CC_B)], b: T_A[T_B[CC_B], CC_B], c: Int) extends T_B[T_A[T_B[Char], T_A[Char, Int]]]
case class CC_D(a: T_B[Int], b: CC_C) extends T_B[T_A[T_B[Char], T_A[Char, Int]]]

val v_a: T_B[T_A[T_B[Char], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A((_,_), _, _), CC_A(_, _, CC_A(_, _, _)), 12) => 1 
  case CC_C(CC_A((_,_), _, _), CC_A(_, _, CC_A(_, _, _)), _) => 2 
  case CC_D(_, _) => 3 
}
}