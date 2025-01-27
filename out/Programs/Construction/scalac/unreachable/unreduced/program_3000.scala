package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_B[D]], b: D) extends T_A[D, T_B[D]]
case class CC_B[E](a: Boolean, b: T_B[T_B[Char]], c: T_A[E, E]) extends T_B[E]
case class CC_C[G](a: G, b: T_B[G]) extends T_B[G]
case class CC_D[H](a: Byte, b: (Char,CC_A[Int])) extends T_B[H]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _, _), _) => 0 
  case CC_B(_, CC_C(CC_B(_, _, _), CC_B(_, _, _)), _) => 1 
  case CC_B(_, CC_C(CC_B(_, _, _), CC_C(_, _)), _) => 2 
  case CC_B(_, CC_C(CC_B(_, _, _), CC_D(_, _)), _) => 3 
  case CC_B(_, CC_C(CC_C(_, _), CC_B(_, _, _)), _) => 4 
  case CC_B(_, CC_C(CC_C(_, _), CC_C(_, _)), _) => 5 
  case CC_B(_, CC_C(CC_C(_, _), CC_D(_, _)), _) => 6 
  case CC_B(_, CC_C(CC_D(_, _), CC_B(_, _, _)), _) => 7 
  case CC_B(_, CC_C(CC_D(_, _), CC_C(_, _)), _) => 8 
  case CC_B(_, CC_C(CC_D(_, _), CC_D(_, _)), _) => 9 
  case CC_B(_, CC_D(0, (_,_)), _) => 10 
  case CC_B(_, CC_D(_, (_,_)), _) => 11 
  case CC_C(_, _) => 12 
  case CC_D(_, (_,CC_A(_, _))) => 13 
}
}