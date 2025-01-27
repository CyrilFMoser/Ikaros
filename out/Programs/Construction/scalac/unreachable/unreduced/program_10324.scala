package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: Char) extends T_A[E, T_B[T_B[Int, Boolean], T_A[Boolean, Int]]]
case class CC_B[F, G]() extends T_B[F, G]
case class CC_C(a: CC_A[(Boolean,(Char,Boolean))], b: T_B[T_A[Int, Byte], Boolean], c: T_A[(Boolean,Boolean), Char]) extends T_B[CC_A[T_B[Byte, Char]], T_A[Int, ((Boolean,Byte),Char)]]
case class CC_D(a: (CC_C,Int), b: Char) extends T_B[CC_A[T_B[Byte, Char]], T_A[Int, ((Boolean,Byte),Char)]]

val v_a: T_B[CC_A[T_B[Byte, Char]], T_A[Int, ((Boolean,Byte),Char)]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, 'x'), CC_B(), _) => 1 
  case CC_C(CC_A(_, _), CC_B(), _) => 2 
  case CC_D((CC_C(_, _, _),_), _) => 3 
}
}