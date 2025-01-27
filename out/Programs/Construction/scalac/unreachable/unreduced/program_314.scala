package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: (T_A[Boolean, (Byte,Char)],Boolean), c: C) extends T_A[T_A[(Boolean,Byte), T_A[Boolean, Byte]], C]
case class CC_B[D](a: Boolean) extends T_A[T_A[(Boolean,Byte), T_A[Boolean, Byte]], D]

val v_a: T_A[T_A[(Boolean,Byte), T_A[Boolean, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(0, (_,_), _) => 0 
  case CC_A(_, (_,_), _) => 1 
  case CC_B(_) => 2 
}
}