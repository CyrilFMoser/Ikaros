package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Boolean, c: (T_B[Boolean, Boolean],T_B[Int, Byte])) extends T_A[E, T_A[E, E]]
case class CC_B(a: CC_A[Boolean], b: T_B[T_A[Int, Byte], CC_A[Byte]], c: CC_A[T_B[(Boolean,Byte), Char]]) extends T_A[T_A[T_A[Char, Int], T_A[T_A[Char, Int], T_A[Char, Int]]], T_A[T_A[T_A[Char, Int], T_A[T_A[Char, Int], T_A[Char, Int]]], T_A[T_A[Char, Int], T_A[T_A[Char, Int], T_A[Char, Int]]]]]
case class CC_C(a: CC_A[CC_B]) extends T_A[T_A[T_A[Char, Int], T_A[T_A[Char, Int], T_A[Char, Int]]], T_A[T_A[T_A[Char, Int], T_A[T_A[Char, Int], T_A[Char, Int]]], T_A[T_A[Char, Int], T_A[T_A[Char, Int], T_A[Char, Int]]]]]
case class CC_D[F](a: F, b: (CC_B,T_B[CC_B, CC_B]), c: CC_C) extends T_B[CC_B, F]

val v_a: T_A[T_A[T_A[Char, Int], T_A[T_A[Char, Int], T_A[Char, Int]]], T_A[T_A[T_A[Char, Int], T_A[T_A[Char, Int], T_A[Char, Int]]], T_A[T_A[Char, Int], T_A[T_A[Char, Int], T_A[Char, Int]]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _, _)