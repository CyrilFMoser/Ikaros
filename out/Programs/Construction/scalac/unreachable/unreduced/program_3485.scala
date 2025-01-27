package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: Boolean) extends T_A[T_A[T_A[Boolean, Char], (Boolean,Boolean)], C]
case class CC_B[D](a: Boolean, b: (T_A[Char, Byte],CC_A[(Byte,Byte)])) extends T_A[T_A[T_A[Boolean, Char], (Boolean,Boolean)], D]

val v_a: T_A[T_A[T_A[Boolean, Char], (Boolean,Boolean)], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, (_,CC_A(_, _))) => 1 
}
}