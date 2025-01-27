package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, (Boolean,Byte)],T_A[Boolean, Char]), b: C) extends T_A[T_A[Boolean, Boolean], C]
case class CC_B(a: T_A[Boolean, T_A[Int, Int]], b: CC_A[CC_A[Boolean]], c: Byte) extends T_A[T_A[Boolean, Boolean], Boolean]
case class CC_C[D](a: T_A[T_A[Boolean, Boolean], D], b: T_A[T_A[Boolean, Boolean], CC_B]) extends T_A[T_A[Boolean, Boolean], D]

val v_a: T_A[T_A[Boolean, Boolean], Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_C(CC_A(_, _), _) => 1 
  case CC_C(CC_C(_, _), _) => 2 
}
}