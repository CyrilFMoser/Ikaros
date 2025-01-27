package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, T_A]], b: T_A) extends T_A
case class CC_B(a: T_B[Int, T_A]) extends T_A
case class CC_C[C](a: T_B[C, T_A], b: T_B[C, T_A]) extends T_B[C, T_A]
case class CC_D[D](a: (T_A,T_B[(Boolean,Boolean), T_A]), b: CC_C[D]) extends T_B[D, T_A]

val v_a: T_B[Int, T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
  case CC_C(_, CC_D((_,_), CC_C(_, _))) => 1 
  case CC_D((CC_A(_, _),CC_C(_, _)), _) => 2 
  case CC_D((CC_A(_, _),CC_D(_, _)), _) => 3 
  case CC_D((CC_B(_),CC_C(_, _)), _) => 4 
  case CC_D((CC_B(_),CC_D(_, _)), _) => 5 
}
}