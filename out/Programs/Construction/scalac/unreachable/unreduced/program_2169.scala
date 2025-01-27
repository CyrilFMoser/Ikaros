package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Boolean, b: T_B[D]) extends T_A[D, Byte]
case class CC_B[E](a: CC_A[E], b: Byte, c: T_A[E, Byte]) extends T_A[E, Byte]
case class CC_C[F](a: CC_B[F]) extends T_A[F, Byte]
case class CC_D(a: T_A[(Boolean,Byte), Byte], b: T_A[T_A[Boolean, Byte], T_A[Boolean, Boolean]], c: T_B[T_A[(Boolean,Int), Byte]]) extends T_B[T_A[T_A[Byte, Boolean], Byte]]
case class CC_E(a: ((CC_D,Byte),(Boolean,(Boolean,Char)))) extends T_B[T_A[T_A[Byte, Boolean], Byte]]
case class CC_F(a: CC_B[Char]) extends T_B[T_A[T_A[Byte, Boolean], Byte]]

val v_a: T_B[T_A[T_A[Byte, Boolean], Byte]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(((_,_),(_,_))) => 1 
  case CC_F(CC_B(CC_A(_, _), _, CC_A(_, _))) => 2 
  case CC_F(CC_B(CC_A(_, _), _, CC_B(_, _, _))) => 3 
  case CC_F(CC_B(CC_A(_, _), _, CC_C(_))) => 4 
}
}