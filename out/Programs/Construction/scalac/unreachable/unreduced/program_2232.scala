package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Boolean, T_A[(Char,Int), Byte]], T_A[T_A[Boolean, T_A[(Char,Int), Byte]], T_A[Boolean, T_A[(Char,Int), Byte]]]], b: (T_A[Byte, Char],(Boolean,Byte))) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: T_A[E, E], b: Boolean, c: CC_A[E]) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: T_A[F, T_A[F, F]]) extends T_A[F, T_A[F, F]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, CC_A(_, (_,_))) => 1 
  case CC_C(CC_A(CC_A(_, _), (_,_))) => 2 
  case CC_C(CC_A(CC_B(_, _, _), (_,_))) => 3 
  case CC_C(CC_B(_, _, CC_A(_, _))) => 4 
  case CC_C(CC_C(CC_A(_, _))) => 5 
  case CC_C(CC_C(CC_B(_, _, _))) => 6 
  case CC_C(CC_C(CC_C(_))) => 7 
}
}
// This is not matched: CC_C(CC_A(CC_C(_), (_,_)))