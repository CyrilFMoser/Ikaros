package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[T_A[Int, Boolean], T_A[Boolean, Char]], C]
case class CC_B(a: T_A[CC_A[(Boolean,Char), Char], CC_A[Int, Int]], b: T_A[(Int,(Boolean,Char)), CC_A[(Char,Int), (Boolean,Char)]]) extends T_A[T_A[T_A[Int, Boolean], T_A[Boolean, Char]], T_A[CC_A[Int, Char], CC_A[Int, Boolean]]]
case class CC_C[E](a: T_A[E, E], b: T_A[E, E], c: T_A[E, CC_B]) extends T_A[T_A[T_A[Int, Boolean], T_A[Boolean, Char]], E]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[Boolean, Char]], CC_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, _) => 1 
}
}