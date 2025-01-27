package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, T_B[E]], b: T_A[D, E], c: E) extends T_A[D, E]
case class CC_B[G, F]() extends T_A[G, F]
case class CC_C() extends T_B[T_A[CC_B[Char, Int], T_A[Int, Char]]]
case class CC_D(a: T_B[CC_B[(Boolean,Char), Boolean]]) extends T_B[T_A[CC_B[Char, Int], T_A[Int, Char]]]
case class CC_E(a: T_A[Byte, CC_D], b: T_A[Boolean, CC_D], c: T_A[(CC_C,(Char,Char)), (CC_C,CC_C)]) extends T_B[T_A[CC_B[Char, Int], T_A[Int, Char]]]

val v_a: T_B[T_A[CC_B[Char, Int], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_) => 1 
  case CC_E(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 2 
  case CC_E(CC_A(_, _, _), CC_A(_, _, _), CC_B()) => 3 
  case CC_E(CC_B(), CC_A(_, _, _), CC_A(_, _, _)) => 4 
  case CC_E(CC_B(), CC_A(_, _, _), CC_B()) => 5 
  case CC_E(CC_A(_, _, _), CC_B(), CC_B()) => 6 
  case CC_E(CC_B(), CC_B(), CC_A(_, _, _)) => 7 
  case CC_E(CC_B(), CC_B(), CC_B()) => 8 
}
}
// This is not matched: CC_E(CC_A(_, _, _), CC_B(), CC_A(_, _, _))