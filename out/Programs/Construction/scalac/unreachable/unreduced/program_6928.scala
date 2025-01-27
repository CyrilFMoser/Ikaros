package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_B[D, D]) extends T_A[D]
case class CC_B(a: T_B[T_A[Boolean], T_A[Byte]], b: T_A[(Int,(Char,Byte))]) extends T_A[Byte]
case class CC_C(a: T_A[Byte], b: (CC_B,Byte), c: T_A[Byte]) extends T_A[Byte]
case class CC_D[E](a: T_B[E, Int]) extends T_B[E, Int]
case class CC_E[F]() extends T_B[F, Int]
case class CC_F[G](a: CC_C, b: (Byte,CC_D[CC_C])) extends T_B[G, Int]

val v_a: T_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E() => 1 
  case CC_F(CC_C(CC_A(_, _), (_,_), _), _) => 2 
  case CC_F(CC_C(CC_B(_, _), (_,_), _), _) => 3 
}
}
// This is not matched: CC_F(CC_C(CC_C(_, _, _), (_,_), _), _)