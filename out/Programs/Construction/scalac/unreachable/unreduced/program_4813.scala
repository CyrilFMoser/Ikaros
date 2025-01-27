package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, (T_A[Int, Int],(Char,Int))]
case class CC_B[F](a: F, b: CC_A[F, CC_A[Int, F]]) extends T_A[F, (T_A[Int, Int],(Char,Int))]
case class CC_C(a: CC_A[T_A[Boolean, Char], T_A[Byte, Int]], b: T_B[CC_A[Byte, Int]], c: T_A[Boolean, T_A[Int, Char]]) extends T_B[CC_A[CC_A[(Char,Boolean), Byte], (Boolean,Boolean)]]
case class CC_D[G]() extends T_B[G]
case class CC_E() extends T_B[CC_A[CC_A[(Char,Boolean), Byte], (Boolean,Boolean)]]

val v_a: T_B[CC_A[CC_A[(Char,Boolean), Byte], (Boolean,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), CC_D(), _) => 0 
  case CC_D() => 1 
  case CC_E() => 2 
}
}