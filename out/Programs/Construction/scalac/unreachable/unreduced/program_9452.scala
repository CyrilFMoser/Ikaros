package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Byte], T_A[(Boolean,Byte)]], b: T_B[T_A[Char], T_B[Char, Int]]) extends T_A[T_B[T_B[(Char,Byte), Byte], T_A[Int]]]
case class CC_B[D]() extends T_A[T_B[T_B[(Char,Byte), Byte], T_A[Int]]]
case class CC_C(a: T_A[CC_B[(Int,Byte)]]) extends T_A[T_B[T_B[(Char,Byte), Byte], T_A[Int]]]
case class CC_D[F, E](a: T_B[T_A[Int], F], b: (Char,CC_A)) extends T_B[E, F]

val v_a: T_A[T_B[T_B[(Char,Byte), Byte], T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_D(_, _), (_,_)), CC_D(CC_D(_, _), (_,_))) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}