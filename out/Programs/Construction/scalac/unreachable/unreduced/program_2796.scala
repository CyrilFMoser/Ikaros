package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[D], b: T_A[D, D]) extends T_A[D, E]
case class CC_B[G, F, H](a: (CC_A[Char, Int],Int)) extends T_A[G, F]
case class CC_C(a: Byte, b: T_A[Char, T_B[Boolean]]) extends T_B[T_A[T_A[Byte, Int], T_B[Int]]]
case class CC_D(a: CC_C, b: T_A[T_A[CC_C, CC_C], Char], c: Byte) extends T_B[T_A[T_A[Byte, Int], T_B[Int]]]
case class CC_E(a: CC_D, b: T_B[Char], c: CC_C) extends T_B[T_A[T_A[Byte, Int], T_B[Int]]]

val v_a: T_B[T_A[T_A[Byte, Int], T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_C(0, CC_A(_, _)), CC_A(_, _), _) => 1 
  case CC_D(CC_C(0, CC_B(_)), CC_A(_, _), _) => 2 
  case CC_D(CC_C(_, CC_A(_, _)), CC_A(_, _), _) => 3 
  case CC_D(CC_C(_, CC_B(_)), CC_A(_, _), _) => 4 
  case CC_D(CC_C(0, CC_A(_, _)), CC_B((_,_)), _) => 5 
  case CC_D(CC_C(0, CC_B(_)), CC_B((_,_)), _) => 6 
  case CC_D(CC_C(_, CC_A(_, _)), CC_B((_,_)), _) => 7 
  case CC_D(CC_C(_, CC_B(_)), CC_B((_,_)), _) => 8 
  case CC_E(CC_D(_, CC_A(_, _), _), _, CC_C(_, CC_A(_, _))) => 9 
  case CC_E(CC_D(_, CC_A(_, _), _), _, CC_C(_, CC_B(_))) => 10 
  case CC_E(CC_D(_, CC_B(_), _), _, CC_C(_, CC_B(_))) => 11 
}
}
// This is not matched: CC_E(CC_D(_, CC_B(_), _), _, CC_C(_, CC_A(_, _)))