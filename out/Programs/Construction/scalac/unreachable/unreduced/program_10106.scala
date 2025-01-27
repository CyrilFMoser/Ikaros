package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[T_A[Boolean, Boolean], T_A[(Int,Byte), Int]]]
case class CC_B[D](a: T_A[D, T_A[D, Boolean]], b: T_A[D, Boolean]) extends T_A[D, T_A[T_A[Boolean, Boolean], T_A[(Int,Byte), Int]]]
case class CC_C[E](a: Int, b: Int, c: (T_A[Int, Boolean],T_A[Byte, Char])) extends T_A[E, T_A[T_A[Boolean, Boolean], T_A[(Int,Byte), Int]]]

val v_a: T_A[Boolean, T_A[T_A[Boolean, Boolean], T_A[(Int,Byte), Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}