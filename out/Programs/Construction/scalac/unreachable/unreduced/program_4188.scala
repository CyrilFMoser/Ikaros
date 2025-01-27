package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[T_A, T_A],T_A)) extends T_A
case class CC_B(a: T_B[Char, Int]) extends T_A
case class CC_C[C](a: C, b: T_B[T_A, C], c: T_A) extends T_B[T_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_C(_, _, _),CC_A(_))) => 0 
  case CC_A((CC_C(_, _, _),CC_B(_))) => 1 
  case CC_B(_) => 2 
}
}