package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, E]) extends T_A[E, T_A[T_B[Boolean, Boolean], Byte]]
case class CC_B[F](a: (T_B[Int, Boolean],CC_A[Byte])) extends T_A[T_B[T_A[Char, Char], T_A[Int, (Char,Int)]], F]
case class CC_C[G, H](a: H, b: (T_B[Int, (Char,Byte)],Char), c: (Byte,Byte)) extends T_A[G, T_A[T_B[Boolean, Boolean], Byte]]

val v_a: T_A[T_B[T_A[Char, Char], T_A[Int, (Char,Int)]], T_A[T_B[Boolean, Boolean], Byte]] = null
val v_b: Int = v_a match{
  case CC_B((_,CC_A(_, _))) => 0 
  case CC_C(_, (_,_), (_,_)) => 1 
}
}
// This is not matched: CC_A(_, CC_B(_))