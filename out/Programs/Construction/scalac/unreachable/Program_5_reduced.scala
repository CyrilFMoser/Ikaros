object Test {
sealed trait T_A[A, B]
case class CC_A(a:         Char                        , b:     T_A[Char, Char]                              , c:         Int                                     ) extends T_A[T_A[T_A[Byte, (Int,Byte)], T_A[Byte, Char]], T_A[T_A[Int, Byte], T_A[Char, Byte]]]
case class CC_B() extends T_A[T_A[T_A[Byte, (Int,Byte)], T_A[Byte, Char]], T_A[T_A[Int, Byte], T_A[Char, Byte]]]
val v_a: T_A[T_A[T_A[Byte, (Int,Byte)], T_A[Byte, Char]], T_A[T_A[Int, Byte], T_A[Char, Byte]]] = null
val v_b      = v_a match{
  case CC_A(_, _, _) => 0
  case CC_B() => 1
}
}
