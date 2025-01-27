package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: T_B[T_B[T_A, T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_A, b: T_A, c: CC_A) extends T_A
case class CC_C[C]() extends T_B[T_B[C, C], C]
case class CC_D[D](a: T_B[T_B[D, D], D], b: (T_A,T_B[T_A, CC_B]), c: D) extends T_B[T_B[D, D], D]

val v_a: T_B[T_B[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(), _, _) => 0 
  case CC_D(CC_D(_, (_,_), _), _, _) => 1 
}
}
// This is not matched: CC_C()