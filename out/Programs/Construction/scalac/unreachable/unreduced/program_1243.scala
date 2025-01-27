package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_B[T_A, T_A]], b: T_A) extends T_A
case class CC_B(a: T_A, b: T_A, c: ((T_A,CC_A),CC_A)) extends T_A
case class CC_C(a: Byte, b: CC_A, c: T_A) extends T_A
case class CC_D[C](a: CC_A, b: Boolean) extends T_B[C, (CC_A,T_B[CC_C, (Int,Int)])]
case class CC_E[D]() extends T_B[D, (CC_A,T_B[CC_C, (Int,Int)])]
case class CC_F[E](a: E, b: (T_A,Byte), c: T_A) extends T_B[E, (CC_A,T_B[CC_C, (Int,Int)])]

val v_a: T_B[Byte, (CC_A,T_B[CC_C, (Int,Int)])] = null
val v_b: Int = v_a match{
  case CC_E() => 0 
  case CC_F(_, _, CC_A(_, _)) => 1 
  case CC_F(_, _, CC_B(_, _, _)) => 2 
  case CC_F(_, _, CC_C(_, _, _)) => 3 
}
}
// This is not matched: CC_D(_, _)