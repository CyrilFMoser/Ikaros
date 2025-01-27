package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: (T_A[Int],T_B[Char, Byte])) extends T_A[D]
case class CC_B(a: T_B[Byte, (Boolean,Boolean)]) extends T_A[T_A[T_B[Byte, Int]]]
case class CC_C[E](a: T_A[E], b: T_A[E], c: T_B[E, E]) extends T_B[E, (Byte,CC_B)]
case class CC_D[F](a: (T_A[CC_B],CC_A[CC_B])) extends T_B[F, (Byte,CC_B)]

val v_a: T_B[Int, (Byte,CC_B)] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), CC_A(_, _), _) => 0 
  case CC_D(_) => 1 
}
}