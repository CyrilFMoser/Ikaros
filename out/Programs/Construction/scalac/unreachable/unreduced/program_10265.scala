package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Int, Int], (Char,Int)], b: (T_B[(Boolean,Char), Byte],T_A[Boolean]), c: T_A[Int]) extends T_A[T_A[(Byte,Byte)]]
case class CC_B(a: Char) extends T_A[T_A[(Byte,Byte)]]
case class CC_C[E, D, F](a: CC_A, b: (Boolean,T_B[Int, CC_A]), c: T_A[F]) extends T_B[E, D]
case class CC_D[H, G](a: CC_B, b: (T_A[Boolean],Int), c: (Boolean,T_A[CC_B])) extends T_B[H, G]

val v_a: T_A[T_A[(Byte,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _, _), (CC_C(_, _, _),_), _) => 0 
  case CC_A(CC_D(_, _, _), (CC_C(_, _, _),_), _) => 1 
  case CC_A(CC_C(_, _, _), (CC_D(_, _, _),_), _) => 2 
  case CC_A(CC_D(_, _, _), (CC_D(_, _, _),_), _) => 3 
  case CC_B(_) => 4 
}
}