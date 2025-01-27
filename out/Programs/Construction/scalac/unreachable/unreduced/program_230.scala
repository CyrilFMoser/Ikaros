package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_A[Int, (Byte,Char)]], b: Byte, c: (T_A[(Boolean,Boolean), (Int,Byte)],T_A[Boolean, Boolean])) extends T_A[T_A[T_B[Int], T_B[Boolean]], T_A[(Byte,(Byte,Byte)), T_B[Int]]]
case class CC_B[D](a: D) extends T_A[T_A[T_B[Int], T_B[Boolean]], T_A[(Byte,(Byte,Byte)), T_B[Int]]]
case class CC_C() extends T_A[T_A[T_B[Int], T_B[Boolean]], T_A[(Byte,(Byte,Byte)), T_B[Int]]]

val v_a: T_A[T_A[T_B[Int], T_B[Boolean]], T_A[(Byte,(Byte,Byte)), T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)