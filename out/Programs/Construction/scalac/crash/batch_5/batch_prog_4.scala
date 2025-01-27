package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_B[T_B[T_A, T_A], T_B[T_A, Byte]], c: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C](a: T_B[Byte, Int], b: CC_A, c: C) extends T_B[Byte, C]
case class CC_D[D](a: (CC_B,T_B[Byte, (Boolean,Int)])) extends T_B[Byte, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(0, _, _)) => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
  case CC_A(_, _, CC_B(CC_A(_, _, _))) => 2 
  case CC_A(_, _, CC_B(CC_B(_))) => 3 
  case CC_B(CC_A(_, _, CC_A(_, _, _))) => 4 
  case CC_B(CC_A(_, _, CC_B(_))) => 5 
  case CC_B(CC_B(CC_A(_, _, _))) => 6 
  case CC_B(CC_B(CC_B(_))) => 7 
}
}