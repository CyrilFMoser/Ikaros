package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[Boolean, T_A],T_A)) extends T_A
case class CC_B(a: Int, b: T_B[CC_A, T_B[T_A, T_A]]) extends T_B[CC_A, T_B[T_A, T_A]]
case class CC_C[C](a: (CC_B,T_A), b: T_B[C, C]) extends T_B[T_B[C, C], C]
case class CC_D(a: T_B[T_B[(T_A,(Boolean,Boolean)), (T_A,(Boolean,Boolean))], (T_A,(Boolean,Boolean))], b: CC_B) extends T_B[CC_A, T_B[T_A, T_A]]

val v_a: T_B[CC_A, T_B[T_A, T_A]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
  case CC_B(_, CC_D(CC_C(_, _), _)) => 1 
  case CC_D(CC_C(_, _), CC_B(12, _)) => 2 
  case CC_D(CC_C(_, _), CC_B(_, _)) => 3 
}
}