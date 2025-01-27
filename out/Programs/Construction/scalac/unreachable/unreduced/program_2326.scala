package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Boolean], T_A[(Char,Byte), Byte]], b: (T_A[Char, Byte],T_A[Int, Char]), c: Char) extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Int]], (Int,T_A[(Int,Char), Char])]
case class CC_B() extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Int]], (Int,T_A[(Int,Char), Char])]
case class CC_C[C]() extends T_A[C, T_A[CC_B, CC_A]]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_A[Char, Int]], (Int,T_A[(Int,Char), Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B() => 1 
}
}