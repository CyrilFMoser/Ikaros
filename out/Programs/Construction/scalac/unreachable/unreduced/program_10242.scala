package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Int, b: (T_A[Int, Byte],Int)) extends T_A[E, T_A[T_B[Boolean, Boolean], T_A[Int, Int]]]
case class CC_B[F](a: T_B[Int, F]) extends T_B[Int, F]
case class CC_C[G](a: CC_B[G], b: T_B[Int, G], c: CC_A[T_B[Int, G]]) extends T_B[Int, G]
case class CC_D[H](a: (T_B[Char, Boolean],T_A[(Boolean,Boolean), (Byte,Char)]), b: CC_A[H], c: CC_A[T_B[H, Char]]) extends T_B[Int, H]

val v_a: T_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(_, _, _)) => 0 
  case CC_B(CC_D((_,_), _, _)) => 1 
  case CC_C(_, _, _) => 2 
  case CC_D(_, _, CC_A(_, (_,_))) => 3 
}
}
// This is not matched: CC_B(CC_B(_))