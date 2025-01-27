package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[D, (Boolean,Char)]]
case class CC_B[E](a: (T_A[Byte, Int],T_B[Boolean]), b: T_B[E], c: Int) extends T_A[E, T_A[E, (Boolean,Char)]]
case class CC_C[F]() extends T_A[F, T_A[F, (Boolean,Char)]]

val v_a: T_A[Int, T_A[Int, (Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_), _, _) => 1 
  case CC_C() => 2 
}
}