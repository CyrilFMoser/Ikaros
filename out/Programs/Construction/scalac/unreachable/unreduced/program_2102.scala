package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, ((Boolean,Boolean),T_A)], b: T_A, c: T_A) extends T_A
case class CC_B(a: T_B[T_A, T_A], b: T_B[Char, T_A]) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[C](a: T_B[Int, C], b: (T_B[Int, CC_A],T_B[Int, CC_A]), c: ((T_A,T_A),T_A)) extends T_B[Int, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, CC_A(_, _, _)), _) => 0 
  case CC_A(_, CC_A(_, _, CC_C(_)), _) => 1 
  case CC_A(_, CC_B(_, _), _) => 2 
  case CC_A(_, CC_C(_), _) => 3 
  case CC_B(_, _) => 4 
  case CC_C(_) => 5 
}
}
// This is not matched: CC_A(_, CC_A(_, _, CC_B(_, _)), _)