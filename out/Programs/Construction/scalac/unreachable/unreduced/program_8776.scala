package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: (T_B[Byte],T_A[Char, Boolean]), c: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_B[E]() extends T_A[E, T_A[E, E]]
case class CC_C() extends T_B[Char]
case class CC_D(a: Boolean, b: (T_A[CC_C, CC_C],T_A[CC_C, Char])) extends T_B[Char]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), (_,_), _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(CC_D(_, (_,_)), (_,_), _)