package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Char], b: T_A[T_A[Boolean]], c: (T_B[Int, Int],T_A[Int])) extends T_A[T_B[T_B[Byte, Char], T_B[Boolean, Int]]]
case class CC_B() extends T_A[T_B[T_B[Byte, Char], T_B[Boolean, Int]]]
case class CC_C[D]() extends T_B[D, Boolean]

val v_a: T_A[T_B[T_B[Byte, Char], T_B[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B() => 1 
}
}