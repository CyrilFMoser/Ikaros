package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: (T_A[(Boolean,Byte), Byte],T_B)) extends T_A[C, T_A[T_B, T_A[(Byte,Int), Int]]]
case class CC_B[D](a: (T_B,Char), b: Boolean) extends T_A[D, T_A[T_B, T_A[(Byte,Int), Int]]]
case class CC_C[E](a: CC_B[E], b: (T_B,T_A[T_B, T_B]), c: CC_A[T_B]) extends T_A[E, T_A[T_B, T_A[(Byte,Int), Int]]]

val v_a: T_A[T_B, T_A[T_B, T_A[(Byte,Int), Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(CC_B((_,_), _), (_,_), _)