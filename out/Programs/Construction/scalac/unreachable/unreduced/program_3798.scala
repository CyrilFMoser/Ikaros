package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, Boolean], T_A], b: T_A, c: (Byte,Byte)) extends T_A
case class CC_B(a: Boolean, b: CC_A) extends T_A
case class CC_C[C]() extends T_B[C, T_A]
case class CC_D[D](a: T_B[D, T_A], b: Char, c: T_B[D, D]) extends T_B[D, T_A]
case class CC_E[E](a: E, b: T_B[E, T_A], c: CC_C[E]) extends T_B[E, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), CC_A(_, _, _), (_,_)) => 0 
  case CC_A(CC_D(_, _, _), CC_A(_, _, _), (_,_)) => 1 
  case CC_A(CC_E(_, _, CC_C()), CC_A(_, _, _), (_,_)) => 2 
  case CC_A(CC_C(), CC_B(_, CC_A(_, _, _)), (_,_)) => 3 
  case CC_A(CC_D(_, _, _), CC_B(_, CC_A(_, _, _)), (_,_)) => 4 
  case CC_A(CC_E(_, _, CC_C()), CC_B(_, CC_A(_, _, _)), (_,_)) => 5 
  case CC_B(_, _) => 6 
}
}