package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[Boolean, E]
case class CC_B[F, G](a: T_A[Boolean, G]) extends T_B[T_A[Boolean, T_A[Boolean, Byte]], F]
case class CC_C(a: T_A[Boolean, CC_B[Char, Byte]], b: CC_B[T_B[Int, Int], T_B[Int, Byte]]) extends T_B[T_A[Boolean, T_A[Boolean, Byte]], T_A[T_A[Boolean, Boolean], (Boolean,Char)]]
case class CC_D(a: Byte, b: T_A[T_A[CC_C, (Byte,Boolean)], (CC_C,(Boolean,Byte))]) extends T_B[T_A[Boolean, T_A[Boolean, Byte]], T_A[T_A[Boolean, Boolean], (Boolean,Char)]]

val v_a: T_B[T_A[Boolean, T_A[Boolean, Byte]], T_A[T_A[Boolean, Boolean], (Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_B(_)