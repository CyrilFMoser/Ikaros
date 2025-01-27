package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_A[T_A[D, D], D], b: T_A[D, T_B[E]], c: (T_B[Char],Boolean)) extends T_A[E, D]
case class CC_B[G, F](a: CC_A[F, F]) extends T_A[G, F]
case class CC_C(a: T_A[Char, T_A[Char, (Char,Int)]]) extends T_A[T_B[CC_A[Char, Char]], Int]
case class CC_D(a: T_A[T_A[CC_C, CC_C], T_A[(Boolean,Int), CC_C]], b: T_B[(CC_C,CC_C)]) extends T_B[T_A[CC_A[Boolean, CC_C], (CC_C,CC_C)]]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), (_,_)) => 0 
  case CC_A(CC_A(_, _, _), CC_B(_), (_,_)) => 1 
  case CC_A(CC_B(_), CC_A(_, _, _), (_,_)) => 2 
  case CC_B(CC_A(_, _, _)) => 3 
}
}
// This is not matched: CC_A(CC_B(_), CC_B(_), (_,_))