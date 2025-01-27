package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[Int, T_A], (Byte,T_A)], b: (T_A,T_B[T_A, Int]), c: T_B[T_B[T_A, T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_B[T_A, Int], b: T_A, c: (CC_A,T_B[CC_A, T_A])) extends T_A
case class CC_C[C]() extends T_B[C, T_B[C, Byte]]
case class CC_D[D](a: Char, b: Boolean) extends T_B[D, Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(_, _, _) => 1 
}
}