package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Int],(Boolean,Byte)), b: C) extends T_A[C, T_A[T_A[Byte, Boolean], T_A[(Byte,Int), Int]]]
case class CC_B[D](a: CC_A[CC_A[D]]) extends T_A[D, T_A[T_A[Byte, Boolean], T_A[(Byte,Int), Int]]]
case class CC_C[E](a: CC_A[T_A[E, Int]], b: CC_A[E]) extends T_A[E, T_A[T_A[Byte, Boolean], T_A[(Byte,Int), Int]]]

val v_a: T_A[Int, T_A[T_A[Byte, Boolean], T_A[(Byte,Int), Int]]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_)), _) => 0 
  case CC_B(CC_A((_,_), CC_A(_, _))) => 1 
  case CC_C(_, _) => 2 
}
}