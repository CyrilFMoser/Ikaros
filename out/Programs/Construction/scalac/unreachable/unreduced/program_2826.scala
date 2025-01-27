package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Boolean], b: Int, c: T_B[T_A[Boolean], (Boolean,Boolean)]) extends T_A[T_B[T_A[Byte], (Int,Int)]]
case class CC_B() extends T_A[T_B[T_A[Byte], (Int,Int)]]
case class CC_C(a: CC_A, b: CC_B) extends T_A[T_B[T_A[Byte], (Int,Int)]]
case class CC_D[E, D](a: Boolean, b: (T_B[(Boolean,Byte), Byte],CC_A)) extends T_B[D, E]
case class CC_E[F](a: F) extends T_B[F, T_A[F]]
case class CC_F[G, H]() extends T_B[G, H]

val v_a: T_A[T_B[T_A[Byte], (Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_F()) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_B()) => 2 
}
}
// This is not matched: CC_A(_, _, CC_D(_, _))